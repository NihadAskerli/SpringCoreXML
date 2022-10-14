package az.company.customer.dao;

import az.company.beans.User;
import az.company.customer.dao.inter.ICustomerDAO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository (value = "dao2")
public class CustomerDAO2 implements ICustomerDAO {
//    @Override
//    public String toString(){
//        return "hello, this is customer";
//    }
    @Override
    public List<User> getUsers(){
        List<User> list=new ArrayList<>();
        System.out.println("Dao 2 started");
        list.add(new User("Kanan"));
        return list;
    }

}
