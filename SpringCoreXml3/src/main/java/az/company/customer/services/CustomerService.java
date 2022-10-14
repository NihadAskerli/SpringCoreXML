package az.company.customer.services;

import az.company.beans.User;

import az.company.customer.dao.inter.ICustomerDAO;
import az.company.customer.services.inter.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired(required = false)
            @Qualifier (value = "dao1")
    ICustomerDAO customerDAO;
//    @Override
//    public String toString(){
//        return "CustomerService [customerDAO="+customerDAO+"]";
//    }


    @Override
    public List<User> getUsers() {
        List<User> list= customerDAO.getUsers();
        for(User u:list){
            System.out.println(u);
        }
        return list;

    }
}

