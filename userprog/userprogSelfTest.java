
package nachos.userprog;
import nachos.machine.*;
import nachos.threads.*;
import nachos.userprog.*;
/*
Test the functionality of handleOpen, handleWrite, handleRead, handleClose, handleExit
*/
public class userprogSelfTest {
    
    public void testFile() {
    UserProcess process =  new UserProcess();
    String data = "Hello World\n";
    byte buffer[] = new byte[100];
    int fileDescriptor = process.handleCreate(0);
    process.handleOpen(fileDescriptor);
    process.handleWrite(fileDescriptor, 100, data.length());
    process.handleRead(fileDescriptor, 100, data.length());
    process.handleClose(fileDescriptor);
    process.handleExit(0);
    }
    
    public void run() {
        testFile();
    }
}
