package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DocumentPrintRequestDtoInterface extends Remote{
    public void setDocumentCust(String CustomerID, Document doc) throws RemoteException;
    public DocumentPrintRequestDto getObjectPrint() throws RemoteException;
    public void printde7k() throws RemoteException;
}
