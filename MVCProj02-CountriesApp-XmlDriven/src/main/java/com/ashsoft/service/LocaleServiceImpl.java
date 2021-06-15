package com.ashsoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocaleServiceImpl implements ILocaleService {

	@Override
	public List<String> fetchAllCountries() {
		
		Locale locales[] = Locale.getAvailableLocales();
		List<String> listCountries = new ArrayList();
		
		for(Locale l : locales)
		{
			if(l!=null &&l.getDisplayCountry().length()!=0)
			{
				listCountries.add(l.getDisplayCountry());
			}
		}
		return listCountries;
	}

}
