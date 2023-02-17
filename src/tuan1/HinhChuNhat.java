package tuan1;

public class HinhChuNhat {
	//khai bao thuoc tinh theo public kieu double 
	public double chieuDai;
	public double chieuRong;
	//Dong goi chieu dai
	public void setChieuDai(double cd) throws Exception {
		if (cd>0) {
			this.chieuDai=cd;
		} else throw new Exception("Chieu Dai lon hon 0");
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	// dong goi va rang buoc chieu rong
	public void setChieuRong(double cr) throws Exception {
		if (cr>0) {
			this.chieuRong=cr;
		} else throw new Exception("Chieu Rong >0");	
	}
	public double getChieuRong() {
		return this.chieuRong;
	}
	// tao constructor (ham tao doi tuong
	public HinhChuNhat() {
		
	}
	public HinhChuNhat(double cd, double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
	}
	// Tinh chu vi
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	// Tinh dien tich
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}

	public static void main(String[] args) throws Exception {
		// Khoi doi tuong hcn h1
		HinhChuNhat h1= new HinhChuNhat();
		// gan gia tri cho h1
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		System.out.println("Chieu dai da nhap:"+ h1.getChieuDai());
		System.out.println("Chieu rong da nhap:"+h1.getChieuRong());
		// Tinh chu vi 
		System.out.println("Chu vi la:"+ h1.getChuVi());
		// tinh dien tich
		System.out.println("Dien tich la:"+h1.getDienTich());
	}

}
