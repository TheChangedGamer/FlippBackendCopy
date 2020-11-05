package com.FlippCopyBackend.FlippCopy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FlippCopyBackend.FlippCopy.beans.Coupon;
import com.FlippCopyBackend.FlippCopy.services.CouponService;

@RestController
@RequestMapping("/coupon")
public class CouponController {
	@Autowired
	CouponService couponService;
	
	@GetMapping("/all")
	public List<Coupon> getAllCoupon(){
		return couponService.getAllCoupon();
	}
}
