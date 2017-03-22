package app.services.planelist.pojo;

/**
 * Created by jpknox on 22/03/17.
 */

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"src",
		"feeds",
		"srcFeed",
		"showSil",
		"showFlg",
		"showPic",
		"flgH",
		"flgW",
		"Aircraft",
		"totalAc",
		"lastDv",
		"shtTrlSec",
		"stm"
})
public class AircraftList {

	@JsonProperty("src")
	private Long src;
	@JsonProperty("feeds")
	private List<Feed> feeds = null;
	@JsonProperty("srcFeed")
	private Long srcFeed;
	@JsonProperty("showSil")
	private Boolean showSil;
	@JsonProperty("showFlg")
	private Boolean showFlg;
	@JsonProperty("showPic")
	private Boolean showPic;
	@JsonProperty("flgH")
	private Long flgH;
	@JsonProperty("flgW")
	private Long flgW;
	@JsonProperty("acList")
	private List<Aircraft> aircraft = null;
	@JsonProperty("totalAc")
	private Long totalAc;
	@JsonProperty("lastDv")
	private String lastDv;
	@JsonProperty("shtTrlSec")
	private Long shtTrlSec;
	@JsonProperty("stm")
	private Long stm;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("src")
	public Long getSrc() {
		return src;
	}

	@JsonProperty("src")
	public void setSrc(Long src) {
		this.src = src;
	}

	@JsonProperty("feeds")
	public List<Feed> getFeeds() {
		return feeds;
	}

	@JsonProperty("feeds")
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

	@JsonProperty("srcFeed")
	public Long getSrcFeed() {
		return srcFeed;
	}

	@JsonProperty("srcFeed")
	public void setSrcFeed(Long srcFeed) {
		this.srcFeed = srcFeed;
	}

	@JsonProperty("showSil")
	public Boolean getShowSil() {
		return showSil;
	}

	@JsonProperty("showSil")
	public void setShowSil(Boolean showSil) {
		this.showSil = showSil;
	}

	@JsonProperty("showFlg")
	public Boolean getShowFlg() {
		return showFlg;
	}

	@JsonProperty("showFlg")
	public void setShowFlg(Boolean showFlg) {
		this.showFlg = showFlg;
	}

	@JsonProperty("showPic")
	public Boolean getShowPic() {
		return showPic;
	}

	@JsonProperty("showPic")
	public void setShowPic(Boolean showPic) {
		this.showPic = showPic;
	}

	@JsonProperty("flgH")
	public Long getFlgH() {
		return flgH;
	}

	@JsonProperty("flgH")
	public void setFlgH(Long flgH) {
		this.flgH = flgH;
	}

	@JsonProperty("flgW")
	public Long getFlgW() {
		return flgW;
	}

	@JsonProperty("flgW")
	public void setFlgW(Long flgW) {
		this.flgW = flgW;
	}

	@JsonProperty("Aircraft")
	public List<Aircraft> getAircraft() {
		return aircraft;
	}

	@JsonProperty("Aircraft")
	public void setAircraft(List<Aircraft> aircraft) {
		this.aircraft = aircraft;
	}

	@JsonProperty("totalAc")
	public Long getTotalAc() {
		return totalAc;
	}

	@JsonProperty("totalAc")
	public void setTotalAc(Long totalAc) {
		this.totalAc = totalAc;
	}

	@JsonProperty("lastDv")
	public String getLastDv() {
		return lastDv;
	}

	@JsonProperty("lastDv")
	public void setLastDv(String lastDv) {
		this.lastDv = lastDv;
	}

	@JsonProperty("shtTrlSec")
	public Long getShtTrlSec() {
		return shtTrlSec;
	}

	@JsonProperty("shtTrlSec")
	public void setShtTrlSec(Long shtTrlSec) {
		this.shtTrlSec = shtTrlSec;
	}

	@JsonProperty("stm")
	public Long getStm() {
		return stm;
	}

	@JsonProperty("stm")
	public void setStm(Long stm) {
		this.stm = stm;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
