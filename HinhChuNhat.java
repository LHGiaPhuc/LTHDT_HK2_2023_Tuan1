package Tuan1;

public class HinhChuNhat {
	public double chieuDai;
	public double chieuRong;
	
	public void setChieuDai(double cd) throws Exception{
		if(cd>0) {
			this.chieuDai=cd;
		}else throw new Exception("Chieu dai lon hon 0");
	}
	public double getChieuDai() {
		return this.chieuDai;
	}
	
	public void setChieuRong(double cr) throws Exception{
		if(cr>0) {
			this.chieuRong=cr;
		}else throw new Exception("Chieu rong > 0");
	}
	
	public double getChieuRong() {
		return this.chieuRong;
	}
	
	public HinhChuNhat() {
		
	}
	
	public HinhChuNhat(double cd, double cr) {
		this.chieuDai=cd;
		this.chieuRong=cr;
	}
	
	public double getChuVi() {
		return (getChieuDai()+getChieuRong())*2;
	}
	
	public double getDienTich() {
		return getChieuDai()*getChieuRong();
	}
	
	public static void main(String[] args) throws Exception {
		HinhChuNhat h1= new HinhChuNhat();
		
		h1.setChieuDai(5);
		h1.setChieuRong(3);
		
		System.out.println("Chieu dai la: "+h1.getChieuDai());
		System.out.println("Chieu rong la: "+h1.getChieuRong());
		System.out.println("Chu vi la: "+h1.getChuVi());
		System.out.println("Dien tich la: "+h1.getDienTich());
	}

}
