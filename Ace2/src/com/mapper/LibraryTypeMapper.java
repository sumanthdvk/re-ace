package com.mapper;

import com.input.ConfigitAceImport.Library;
import com.input.ConfigitAceImport.Library.Brands;
import com.input.ConfigitAceImport.Library.ConfiguratorLayouts;
import com.input.ConfigitAceImport.Library.FeatureFamilies;
import com.input.ConfigitAceImport.Library.FeatureFamilies.FeatureFamily;
import com.input.ConfigitAceImport.Library.Features;
import com.input.ConfigitAceImport.Library.Features.Feature;
import com.input.ConfigitAceImport.Library.Languages;
import com.input.ConfigitAceImport.Library.MarketGroups;
import com.input.ConfigitAceImport.Library.MarketGroups.MarketGroup;
import com.input.ConfigitAceImport.Library.Markets;
import com.input.ConfigitAceImport.Library.Markets.Market;
import com.output.BrandCodeCollection;
import com.output.BrandCodeType;
import com.output.BrandCollection;
import com.output.BrandType;
import com.output.ConfiguratorLayoutCollection;
import com.output.ConfiguratorLayoutType;
import com.output.FeatureCollection;
import com.output.FeatureFamilyCollection;
import com.output.FeatureFamilyType;
import com.output.FeatureFamilyTypeEnum;
import com.output.FeatureType;
import com.output.LanguageCodeType;
import com.output.LanguageCollection;
import com.output.LanguageType;
import com.output.LibraryType;
import com.output.LifecycleEnum;
import com.output.MarketCodeCollection;
import com.output.MarketCodeType;
import com.output.MarketCollection;
import com.output.MarketGroupCollection;
import com.output.MarketGroupType;
import com.output.MarketLanguageCodeCollection;
import com.output.MarketType;
import com.output.SecurityLevelEnum;
import com.output.SelectionTypeEnum;

public class LibraryTypeMapper {

	public static void map(Library in, LibraryType out) {
		//mapProperties(in.getp);
		//mapCodeSets(in.getco);
		if(null!=in.getLanguages()) mapLanguages(in.getLanguages(),out.getLanguages());
		mapFeatureFamilies(in.getFeatureFamilies(),out.getFeatureFamilies());
		mapFeatures(in.getFeatures(),out.getFeatures());
		mapBrands(in.getBrands(),out.getBrands());
		mapMarkets(in.getMarkets(),out.getMarkets());
		mapMarketGroups(in.getMarketGroups(),out.getMarketGroups());
		mapConfiguratorLayouts(in.getConfiguratorLayouts(),out.getConfiguratorLayouts());
		//mapProductGroups(in.get);
		//mapDeleteMarketGroups(in.getd);
	}

	private static void mapLanguages(Languages in, LanguageCollection out) {
		// TODO Auto-generated method stub
		LanguageType languageType = new LanguageType();
		if(null!=in.getLanguage().getCode()) languageType.setCode(in.getLanguage().getCode());
		if(null!=in.getLanguage().getName()) languageType.setName(in.getLanguage().getName());
		//languageType.setPropertyValues(in.getLanguage().get);
		out.getLanguage().add(languageType);
		
	}

	private static void mapFeatureFamilies(FeatureFamilies inFeatureFamilies, FeatureFamilyCollection outFeatureFamilies) {
		FeatureFamilyType out;
		for (FeatureFamily in : inFeatureFamilies.getFeatureFamily()) {
			out = new FeatureFamilyType();
			if(null != in.getCode()) out.setCode(in.getCode());
			if(null != in.getDescription()) out.setDescription(in.getDescription());
			if(null != in.getSelectionType()) out.setSelectionType(SelectionTypeEnum.valueOf(in.getSelectionType().toUpperCase()));
			if(null != in.getSecurityLevel()) out.setSecurityLevel(SecurityLevelEnum.valueOf(in.getSecurityLevel().toUpperCase()));
			if(null != in.getLifecycle()) out.setLifecycle(LifecycleEnum.valueOf(in.getLifecycle().toUpperCase()));
			if(null != in.getFeatureFamilyType()){
				if("ProductRange".equalsIgnoreCase(in.getFeatureFamilyType())) in.setFeatureFamilyType("PRODUCT_RANGE");
				if("BrochureModel".equalsIgnoreCase(in.getFeatureFamilyType())) in.setFeatureFamilyType("BROCHURE_MODEL");
				if("ModelYear".equalsIgnoreCase(in.getFeatureFamilyType())) in.setFeatureFamilyType("MODEL_YEAR");
				if("BuildPhase".equalsIgnoreCase(in.getFeatureFamilyType())) in.setFeatureFamilyType("BUILD_PHASE");
				
				out.setFeatureFamilyType(FeatureFamilyTypeEnum.valueOf(in.getFeatureFamilyType().toUpperCase()));
			}
			
			outFeatureFamilies.getFeatureFamily().add(out);
		}
	}

	private static void mapFeatures(Features features, FeatureCollection features2) {
		// TODO Auto-generated method stub
		FeatureType out;
		for (Feature in : features.getFeature()) {
			out = new FeatureType();
			if(null != in.getCode()) out.setCode(in.getCode());
			if(null != in.getDescription()) out.setDescription(in.getDescription());
			if(null != in.getFeatureFamily()) out.setFeatureFamily(in.getFeatureFamily());
			if(null != in.getLifecycle()) out.setLifecycle(LifecycleEnum.valueOf(in.getLifecycle().toUpperCase()));
			if(null != in.getSecurityLevel()) out.setSecurityLevel(SecurityLevelEnum.valueOf(in.getSecurityLevel().toUpperCase()));
			features2.getFeature().add(out);
		}
	}

	private static void mapBrands(Brands brands, BrandCollection brands2) {
		// TODO Auto-generated method stub
		BrandType brandType = new BrandType();
		if(null != brands.getBrand().getCode()) brandType.setCode(brands.getBrand().getCode());
		if(null != brands.getBrand().getColor()) brandType.setColor(brands.getBrand().getColor());
		if(null != brands.getBrand().getDescription()) brandType.setDescription(brands.getBrand().getDescription());
		if(null != brands.getBrand().getFeature()) brandType.setFeature(brands.getBrand().getFeature());
		
		brands2.getBrand().add(brandType);
	}

	private static void mapMarkets(Markets inMarkets, MarketCollection outMarkets) {
		MarketType out;
		
		for (Market in : inMarkets.getMarket()) {
			out = new MarketType();
			if(null != in.getCode()) out.setCode(in.getCode());
			if(null != in.getDescription()) out.setDescription(in.getDescription());
			if(null != in.getFeature()) out.setFeature(in.getFeature());
			
			mapLanguageCodeType(in,out);
			
			outMarkets.getMarket().add(out);
		}
	}

	private static void mapLanguageCodeType(Market in, MarketType out) {
		MarketLanguageCodeCollection languages = new MarketLanguageCodeCollection();
		LanguageCodeType languageCodeType = new LanguageCodeType();

		languageCodeType.setCode(in.getLanguages().getLanguage().getCode());
		languages.getLanguage().add(languageCodeType);
		
		out.setLanguages(languages);
	}

	private static void mapMarketGroups(MarketGroups inMarketGroups, MarketGroupCollection outMarketGroups2) {
		MarketGroupType out;
		for (MarketGroup in : inMarketGroups.getMarketGroup()) {
			out = new MarketGroupType();
			if(null != in.getDescription()) out.setDescription(in.getDescription());
			if(null != in.getCode()) out.setCode(in.getCode());
			
			out.setBrands(new BrandCodeCollection());
			BrandCodeType brandCodeType = new BrandCodeType();
			if(null != in.getBrands().getBrand().getCode()) brandCodeType.setCode(in.getBrands().getBrand().getCode());
			out.getBrands().getBrand().add(brandCodeType);
			
			out.setMarkets(new MarketCodeCollection());
			MarketCodeType marketCodeType;
			for (com.input.ConfigitAceImport.Library.MarketGroups.MarketGroup.Markets.Market inMarket : in.getMarkets().getMarket()) {
				marketCodeType = new MarketCodeType();
				if(null != inMarket.getCode()) marketCodeType.setCode(inMarket.getCode());
				out.getMarkets().getMarket().add(marketCodeType);
			}
			outMarketGroups2.getMarketGroup().add(out);
		}
	}

	private static void mapConfiguratorLayouts(ConfiguratorLayouts inConfiguratorLayouts,
			ConfiguratorLayoutCollection outConfiguratorLayouts) {
		ConfiguratorLayoutsMapper.map(inConfiguratorLayouts,outConfiguratorLayouts);
	}

	

}
