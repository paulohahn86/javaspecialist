package com.algaworks.localclasses;

import java.math.BigDecimal;

public interface Transaction {

    BigDecimal getTotalValue();
    void refund();

}
