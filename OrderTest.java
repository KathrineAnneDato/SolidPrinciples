public class OrderTest {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderService();
        orderProcessor.calculateTotal(10.0, 2);
        orderProcessor.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoiceGenerator = new InvoiceService();
        invoiceGenerator.generateInvoice("order_123.pdf");

        NotificationService notificationService = new EmailNotification();
        notificationService.sendEmailNotification("johndoe@example.com");
    }
}