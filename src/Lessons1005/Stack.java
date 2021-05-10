package Lessons1005;

public class Stack {

    private Note[] notes;
    private int pointer;

    public Stack(int size) {
        notes = new Note[size];
        this.pointer = -1;
    }
    //not nice implementation, without error checking
    public void push(Note note) throws StackFullException{
        if(pointer == notes.length -1){
            throw new StackFullException("Stack already super full. Cannot push in full Stack");
        }
         notes[++pointer] = note;
    }

    public Note pop() throws StackEmptyException {
        if(pointer == -1) {
            // now we want to throw the error
            throw new StackEmptyException("Cannot pop empty Stack");
        }
        Note n = notes[pointer];
        notes[pointer--] = null;  //notes[pointer] = null; afterwards  --pointer
        return n;
    }


}
