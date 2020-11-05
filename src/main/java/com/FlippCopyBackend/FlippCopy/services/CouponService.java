package com.FlippCopyBackend.FlippCopy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FlippCopyBackend.FlippCopy.beans.Coupon;
import com.FlippCopyBackend.FlippCopy.doas.CouponDao;

@Service
public class CouponService {
	
	@Autowired
	CouponDao couponDao;
	
	public List<Coupon> getAllCoupon(){
		System.out.println("List coupon called");
		return couponDao.findAll();
	}
}
