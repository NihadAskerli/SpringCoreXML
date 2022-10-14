package az.company.customer.dao.inter;

import az.company.beans.User;

import java.util.List;

public interface ICustomerDAO {
    public List<User> getUsers();
}
