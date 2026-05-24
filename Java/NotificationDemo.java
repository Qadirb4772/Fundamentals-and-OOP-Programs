public class NotificationDemo{
  public static void main(String[] args){
    Notification[] notifications = new Notification[2]; 
    EmailNotification myEmail = new EmailNotification("EM100100", "Request for Attending Opening Ceremony", "Assalam O Alaikum Dear! \n You are cordially invited for attending our opening ceremony of our new shop\n We look forward your attendance\n Thank You");
    SmsNotification mySms = new SmsNotification("SMS122344", "Salam", 10);
    notifications[0] = myEmail;
    notifications[1] = mySms;
    
    for(int i = 0; i < notifications.length; i++){
      notifications[i].preview();
    }
    
  }
}
