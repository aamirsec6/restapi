package com.firstapi.restdemo;

public class Cloudvendor{
    private String vendorid;
    private String vendorname;
    private String vendoraddress;
    private String vendorphonenumber;

    public Cloudvendor() {

    }


    public Cloudvendor(String vendorid, String vendorname, String vendoraddress, String vendorphonenumber) {
        this.vendorid = vendorid;
        this.vendorname = vendorname;
        this.vendoraddress = vendoraddress;
        this.vendorphonenumber = vendorphonenumber;
    }
    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public void setVendoraddress(String vendoraddress) {
        this.vendoraddress = vendoraddress;
    }

    public void setVendorphonenumber(String vendorphonenumber) {
        this.vendorphonenumber = vendorphonenumber;
    }

    public String getVendorid() {
        return vendorid;
    }

    public String getVendorname() {
        return vendorname;
    }

    public String getVendoraddress() {
        return vendoraddress;
    }

    public String getVendorphonenumber() {
        return vendorphonenumber;
    }
}
