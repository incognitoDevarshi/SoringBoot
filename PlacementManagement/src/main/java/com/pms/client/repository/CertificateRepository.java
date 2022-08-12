package com.pms.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pms.client.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {

}
