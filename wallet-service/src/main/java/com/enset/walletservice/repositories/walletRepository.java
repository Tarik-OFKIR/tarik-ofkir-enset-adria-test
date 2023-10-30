package com.enset.walletservice.repositories;

import com.enset.walletservice.entities.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface walletRepository extends JpaRepository<Wallet,Long> {
}
