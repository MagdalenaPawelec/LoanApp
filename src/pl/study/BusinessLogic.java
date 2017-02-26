package pl.study;

public class BusinessLogic {


    public void grantLoan(Customer customer, Loan loan, Metadata metadata) {

        if(isCustomerAllowedForLoan(customer, loan)) {
            customer.addLoan(loan);
            //TODO:saveInDb();
            //TODO:notifyFrontend(Decision and others);
        } else {
            //TODO:notifyFrontend(Decision and others);
        }

    }

    public void extendCustomersLoan(Loan loan) {

    }
    public void retrieveHistory(Customer customer) {

    }

    private boolean isCustomerAllowedForLoan(Customer customer, Loan loan) {

        checkNumberOFcurrentLoans;
        checkTimeAndIp;

        return true;
    }
}
