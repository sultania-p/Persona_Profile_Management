/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author piyus
 */
public class Person {
    
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String MailingAddressLine;
    private String City;
    private String State;
    private Integer ZipCode;
    private String Country;
    private String DateOfBirth;
    private Integer TelephoneNumber;
    private Integer CellPhoneNumber;
    private Integer FaxNumber;
    private String EmailAddress;
    private Integer SocialSecurityNumber;
    private String MedicalRecordNumber;
    private String HealthPlanBeneficiaryNumber;
    private Integer BankAccountNumber;
    private String CertificateOrLicenseNumber;
    private String VehicleIdentifiersAndSerialNumbers;
    private String DeviceIdentifiersAndSerialNumbers;
    private String LinkedInAddress;
    private String IPAddress;
    private String Path;

    public void getImage() {
        JFrame editorFrame = new JFrame("Image Demo");
        BufferedImage image = null;
        try
        {
        image = ImageIO.read(new File(this.Path));
        }
        catch (Exception e)
        {
        e.printStackTrace();
        System.exit(1);
        }
        ImageIcon imageIcon = new ImageIcon(fitimage(image, 500, 500));
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

        editorFrame.pack();
        editorFrame.setLocationRelativeTo(null);
        editorFrame.setVisible(true);
    }
    
    private Image fitimage(Image img , int w , int h)
        {
            BufferedImage resizedimage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
            Graphics2D g2 = resizedimage.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(img, 0, 0,w,h,null);
            g2.dispose();
            return resizedimage;
        }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getMailingAddressLine() {
        return MailingAddressLine;
    }

    public void setMailingAddressLine(String MailingAddressLine) {
        this.MailingAddressLine = MailingAddressLine;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public Integer getZipCode() {
        return ZipCode;
    }

    public void setZipCode(Integer ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public Integer getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(Integer TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public Integer getCellPhoneNumber() {
        return CellPhoneNumber;
    }

    public void setCellPhoneNumber(Integer CellPhoneNumber) {
        this.CellPhoneNumber = CellPhoneNumber;
    }

    public Integer getFaxNumber() {
        return FaxNumber;
    }

    public void setFaxNumber(Integer FaxNumber) {
        this.FaxNumber = FaxNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public Integer getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(Integer SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public String getMedicalRecordNumber() {
        return MedicalRecordNumber;
    }

    public void setMedicalRecordNumber(String MedicalRecordNumber) {
        this.MedicalRecordNumber = MedicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return HealthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String HealthPlanBeneficiaryNumber) {
        this.HealthPlanBeneficiaryNumber = HealthPlanBeneficiaryNumber;
    }

    public Integer getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(Integer BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getCertificateOrLicenseNumber() {
        return CertificateOrLicenseNumber;
    }

    public void setCertificateOrLicenseNumber(String CertificateOrLicenseNumber) {
        this.CertificateOrLicenseNumber = CertificateOrLicenseNumber;
    }

    public String getVehicleIdentifiersAndSerialNumbers() {
        return VehicleIdentifiersAndSerialNumbers;
    }

    public void setVehicleIdentifiersAndSerialNumbers(String VehicleIdentifiersAndSerialNumbers) {
        this.VehicleIdentifiersAndSerialNumbers = VehicleIdentifiersAndSerialNumbers;
    }

    public String getDeviceIdentifiersAndSerialNumbers() {
        return DeviceIdentifiersAndSerialNumbers;
    }

    public void setDeviceIdentifiersAndSerialNumbers(String DeviceIdentifiersAndSerialNumbers) {
        this.DeviceIdentifiersAndSerialNumbers = DeviceIdentifiersAndSerialNumbers;
    }

    public String getLinkedInAddress() {
        return LinkedInAddress;
    }

    public void setLinkedInAddress(String LinkedInAddress) {
        this.LinkedInAddress = LinkedInAddress;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }
   
}
