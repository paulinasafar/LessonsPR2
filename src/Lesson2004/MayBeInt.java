package Lesson2004;

public class MayBeInt {

    private int data;
    private int status;

    public MayBeInt(int data, int status) {
        this.data = data;
        this.status = status;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
// this print depends on status and implements access security
    public String print() {
        switch (status) {
            case 1: return "Data is: " + data;
            case 2: return "No access allowed!";
            case 3: return "Not available";
            default: return "Wrong status";
        }
    }



}
