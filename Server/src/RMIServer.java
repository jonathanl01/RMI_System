
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan
 */
public class RMIServer extends UnicastRemoteObject implements RMI{
    
    public RMIServer() throws RemoteException{
        super();
    }

    @Override
    public String getData(String text) throws RemoteException {
        text = "Hi "+ text;
        return text;
    }
    
    public static void main (String args[]){
        try{
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("server", new RMIServer());
            System.out.println("Started server");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public Catalog getCatalog() throws RemoteException {
        Catalog list = new Catalog("Kirill", 4);
        return list;
    }
    
    
}
