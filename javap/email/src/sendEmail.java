import java.net.Authenticator;

public class sendEmail extends Authenticator {
	static String from = "buddhaatamang123@gmail.com";
	static String pass = "123Ss$Ss$";
	private static InternetAddress to;

	public static void main(String args[]) throws MessagingException{
		Properties properties = System.getProperties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.user", from);
		properties.put("mail.smtp.password", pass);
		Session session = Session.getDefaultInstance(properties);
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress("buddhaatamang@gmail.com"));
		to = new InternetetAddress("buddhaatamang123@gmail.com");
		msg.addRecipient(Message.RecipientType.TO,to);
		msg.setSubject("Test Java Mail");
		msg.setText("Hello, this is an example of sending email");

		Transport transport = session.getTransport("smtp");
		transport.connect("smtp.gmail.com", from, pass);
		transport.sendMessage(msg, msg.getAllRecipients());
		System.out.println("Message sent successfully....");
		transport.close();
	}
}
