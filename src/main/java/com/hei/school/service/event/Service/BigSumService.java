package com.hei.school.service.event.Service;
import java.math.BigInteger;
import org.springframework.stereotype.Service;
@Service
public class BigSumService {
    public BigInteger add(String a, String b) {
        BigInteger bigsumA = new BigInteger(a);
        BigInteger bigsumB = new BigInteger(b);
        return bigsumA.add(bigsumB);
    }
}