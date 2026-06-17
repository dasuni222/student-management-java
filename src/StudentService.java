import java.sql.*;

public class StudentService {

    // CREATE
    public void addStudent(Student s) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "INSERT INTO students (id, name, course) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());

            ps.executeUpdate();

            System.out.println("✔ Student Added");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public void viewStudents() {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- STUDENT LIST ---");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("course")
                );
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SEARCH
    public void searchStudent(int id) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "SELECT * FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("✔ Found:");
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("course")
                );
            } else {
                System.out.println("Not Found");
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted");
            else
                System.out.println("Not Found");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE (NEW POLISH FEATURE ⭐)
    public void updateStudent(Student s) {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE students SET name=?, course=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getId());

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated");
            else
                System.out.println("Not Found");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}