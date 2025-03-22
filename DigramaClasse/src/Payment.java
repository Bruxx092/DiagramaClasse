import java.util.Date;

public class Payment {
    private String checkNumber;
    private String creditCardNumber;
    private Date expirationDate;

    // Construtor
    public Payment(String checkNumber, String creditCardNumber, Date expirationDate) {
        this.checkNumber = checkNumber;
        this.creditCardNumber = creditCardNumber;
        this.expirationDate = expirationDate;
    }

    // Métodos getters e setters
    public String getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Métodos específicos
    public boolean verifyCreditCardNumber() {
        // Lógica para verificar o número do cartão de crédito
        return true; // Substitua pela lógica correta
    }

    public boolean verifyCheckPayment() {
        // Lógica para verificar o pagamento com cheque
        return true; // Substitua pela lógica correta
    }
}