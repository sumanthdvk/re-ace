package com.mapper;

import java.util.List;

import com.input.ConfigitAceImport;
import com.input.ConfigitAceImport.DataValidationOptions;
import com.input.ConfigitAceImport.ImportDetails;
import com.input.ConfigitAceImport.Library;
import com.input.ConfigitAceImport.PostImportValidationOptions;
import com.input.ConfigitAceImport.ProductRanges;
import com.input.ConfigitAceImport.ProductRanges.ProductRange;
import com.output.BrandCollection;
import com.output.ConfigitAceImportType;
import com.output.ConfiguratorLayoutCollection;
import com.output.DataValidationOptionsType;
import com.output.FamilyCodeType;
import com.output.FeatureCollection;
import com.output.FeatureFamilyCollection;
import com.output.ImportDetailsType;
import com.output.LanguageCollection;
import com.output.LibraryType;
import com.output.MarketCollection;
import com.output.MarketGroupCollection;
import com.output.MetadataType;
import com.output.OnFailureEnum;
import com.output.OnSuccessEnum;
import com.output.PostImportValidationOptionsType;
import com.output.ProductRangeCollection;
import com.output.ProductRangeType;
import com.output.ValidationActionEnum;

public class ConfigitAceImportMapper {

	public static void mapToConfigitAceImportType(ConfigitAceImport in,ConfigitAceImportType out ) {
		//mapToImportDetailsType(in.getImportDetails(),out.getImportDetails());
		//mapToMetadataType(in,out.getMetadata());// no metadata in source as of now
		//mapToDataValidationOptionsType(in.getDataValidationOptions(),out.getDataValidationOptions());
		//mapToPostImportValidationOptionsType(in.getPostImportValidationOptions(),out.getPostImportValidationOptions());
		LibraryType libraryType = new LibraryType();
		ProductRangeCollection productRangeCollection = new ProductRangeCollection();
		
		out.setLibrary(libraryType);
		out.setProductRanges(productRangeCollection);
		
		mapToLibraryType(in.getLibrary(),libraryType);
		mapToProductRangeCollection(in.getProductRanges(),productRangeCollection);
		
	}

	private static void mapToProductRangeCollection(ProductRanges inProductRanges,
			ProductRangeCollection outProductRanges) {
		ProductRangeCollectionMapper.map(inProductRanges, outProductRanges);
	}

	private static void mapToLibraryType(Library library, LibraryType library2) {
		library2.setLanguages(new LanguageCollection());
		library2.setFeatureFamilies(new FeatureFamilyCollection());
		library2.setFeatures(new FeatureCollection());
		library2.setBrands(new BrandCollection());
		library2.setMarkets(new MarketCollection());
		library2.setMarketGroups(new MarketGroupCollection());
		library2.setConfiguratorLayouts(new ConfiguratorLayoutCollection());
		LibraryTypeMapper.map(library, library2);
	}

	private static void mapToPostImportValidationOptionsType(PostImportValidationOptions in,
			PostImportValidationOptionsType out) {
		out.setCompileProductRanges(null);//check impact later
		out.getCreateWorkItem().setOnFailure(OnFailureEnum.valueOf(in.getCreateWorkItem().getOnFailure()));
		out.getCreateWorkItem().setOnSuccess(OnSuccessEnum.valueOf(in.getCreateWorkItem().getOnSuccess()));
		out.setPreventPromotionIfMasterChanged(null);//check impact later
	}

	private static void mapToDataValidationOptionsType(DataValidationOptions in,
			DataValidationOptionsType out) {
		// TODO Auto-generated method stub
		out.getModelYearMapping().setValidation(ValidationActionEnum.valueOf(in.getModelYearMapping().getValidation()));
		out.getRule().setAllowAceRules(Boolean.parseBoolean(in.getRule().getAllowAceRules()));
		out.getRule().setValidation(ValidationActionEnum.valueOf(in.getRule().getValidation()));
	}

	private static void mapToMetadataType(ConfigitAceImport in, MetadataType metadata) {
			// No meta data as of now to map
			
	}
	
	private static void mapToImportDetailsType(ImportDetails in, ImportDetailsType out) {
		// TODO Auto-generated method stub
		out.setDescription(in.getDescription());
		out.setImportId(in.getImportId());
		out.setSource(in.getSource());
	}

	

}
