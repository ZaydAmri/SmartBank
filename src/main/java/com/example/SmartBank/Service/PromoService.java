package com.example.SmartBank.Service;

import com.example.SmartBank.Enteties.Promo;

import java.util.List;
import java.util.Optional;

public interface PromoService {
    public void saveOrUpadte(Promo promo);
    public Optional<Promo> getPromoById(long id);
    public void delete(long id);
    public List<Promo> getAllPromos();
}
