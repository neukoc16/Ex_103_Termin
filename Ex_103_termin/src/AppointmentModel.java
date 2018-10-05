
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 * @author Konstantin
 */
public class AppointmentModel extends AbstractListModel {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    @Override
    public int getSize() {
        return appointments.size();
    }

    @Override
    public Object getElementAt(int index) {
        return appointments.get(index);
    }

    public int add(Appointment ap) {
        int i = 0;
        for (Appointment appointment : appointments) {
            if (appointments.get(i).getDate().isAfter(ap.getDate())) {
                break;
            }
        }
        appointments.add(i, ap);
        fireIntervalAdded(this, i, i);
        return i;
    }

    public void remove(int[] ind) {
        for (int i : ind) {
            int idx = ind[i];
            appointments.remove(idx - i);
        }
        fireIntervalRemoved(this, ind[0], ind[ind.length - 1]);
    }

    public int update(int index, Appointment updated) {
        appointments.remove(index);
        fireIntervalRemoved(this, index, index);
        return add(updated);
    }

    public void save(File f) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Appointment appointment : appointments) {
            oos.writeObject(appointment);
        }
        oos.close();
    }

    public void load(File f) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            try {
                Object ap;
                while ((ap = ois.readObject()) != null) {
                    add((Appointment) ap);
                }
            } catch (EOFException ex) {
            }
        }
    }
}
