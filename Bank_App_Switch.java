import java.util.Scanner;

public class Bank_App_Switch {
    public static void main(String[] args) {
        String userName, passWord;
        int right = 3;
        int selection;
        int balance = 15000;
        int money;
        Scanner input = new Scanner(System.in);
        System.out.println("Developer Bank'a Hoşgeldiniz.");
        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.println();
            System.out.print("Şifrenizi Giriniz: ");
            passWord = input.nextLine();
            if (passWord.equals("patates12345") && userName.equals("barkobt")) {
                System.out.println("Sisteme başarıyla giriş yaptınız.\nHoşgeldiniz Barkobt!");
                do {
                    System.out.println("1-Para Çekme\n2-Para Yatırma\n3-Bakiye Sorgulama\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi tuşlayınız: ");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.print("Para çekmek istediğiniz miktarı giriş yapınız: ");
                            money = input.nextInt();
                            if (money < balance && money > 0) {

                                balance -= money;
                                System.out.println("Para çekme işleminiz başarıyla gerçekleşmiştir:");
                            } else {
                                System.out.println("Hesap bakiyeniz yetersiz.");
                            }
                            break;
                        case 2:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                            money = input.nextInt();
                            if (money > 0) {
                                balance += money;
                                System.out.println(money + "TL para yatırma işleminiz başarıyla gerçekleşmiştir.");
                            } else {
                                System.out.println("Yanlış bir tutar girildi, tekrar deneyiniz!");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;
                        case 4:
                            System.out.println("Hoşçakalın, tekrar görüşmek dileğiyle..");
                            break;

                        default:
                            System.out.println("Hatalı bir tuşlama yaptınız! Tekrar deneyiniz.");

                    }
                } while (selection != 4);
                break;



            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!\nKalan hakkınız: " + right);
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, lütfen bankanızla iletişime geçin.");
                    break;
                }
            }


        }


    }
}
