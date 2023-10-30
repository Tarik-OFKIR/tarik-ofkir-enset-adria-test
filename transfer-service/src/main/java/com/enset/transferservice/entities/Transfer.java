package com.enset.transferservice.entities;

import com.enset.transferservice.enums.TransferStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double amount;
    @Enumerated(EnumType.STRING)
    private TransferStatus status;
    private Date createdDate;
    private String source;
    private String destination;
}
