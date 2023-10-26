package entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "to_do_items", schema = "hibernate2")
public class ToDoItemsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "date")
    private Date date;
    @Basic
    @Column(name = "task")
    private String task;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDoItemsEntity1 that = (ToDoItemsEntity1) o;

        if (id != that.getId()) return false;
        if (date != null ? !date.equals(that.getDate()) : that.getDate() != null) return false;
        if (task != null ? !task.equals(that.getTask()) : that.getTask() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }
}
