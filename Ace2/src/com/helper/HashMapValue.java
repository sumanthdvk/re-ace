package com.helper;


import java.util.HashSet;
import java.util.Set;

import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.BrochureModelDerivatives.BrochureModelDerivative;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.Features.Feature;
import com.input.ConfigitAceImport.ProductRanges.ProductRange.FeatureApplicability.FeatureApplicabilitySpans.FeatureApplicabilitySpan.Markets.Market;

public class HashMapValue {
	Set<Market> markets;
	Set<BrochureModelDerivative> brochureModelDerivatives;
	Set<Feature> features;
	public Set<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(Set<Feature> features) {
		this.features = features;
	}
	public Set<BrochureModelDerivative> getBrochureModelDerivatives() {
		return brochureModelDerivatives;
	}
	public void setBrochureModelDerivatives(
			Set<BrochureModelDerivative> brochureModelDerivatives) {
		this.brochureModelDerivatives = brochureModelDerivatives;
	}
	public Set<Market> getMarkets() {
		return markets;
	}
	public void setMarkets(Set<Market> markets) {
		this.markets = markets;
	}
	public HashMapValue() {
		markets= new HashSet<Market>();
		brochureModelDerivatives = new HashSet<BrochureModelDerivative>();
		features=new HashSet<Feature>();
	}
}
