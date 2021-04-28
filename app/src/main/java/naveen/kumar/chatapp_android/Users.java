package naveen.kumar.chatapp_android;

public class Users {

    String uid, name, phone, image;


    public Users(){

    }

    public Users(String uid, String name, String phone, String image) {
        this.uid = uid;
        this.name = name;
        this.phone = phone;
        this.image = image;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
