package com.FlippCopyBackend.FlippCopy.doas;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlippCopyBackend.FlippCopy.beans.Coupon;

public interface CouponDao extends JpaRepository<Coupon, Integer> {

}
