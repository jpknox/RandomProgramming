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
		"acList",
		"totalAc",
		"lastDv",
		"shtTrlSec",
		"stm"
})
public class AircraftList {

	@JsonProperty("src")
	private Integer src;
	@JsonProperty("feeds")
	private List<Feed> feeds = null;
	@JsonProperty("srcFeed")
	private Integer srcFeed;
	@JsonProperty("showSil")
	private Boolean showSil;
	@JsonProperty("showFlg")
	private Boolean showFlg;
	@JsonProperty("showPic")
	private Boolean showPic;
	@JsonProperty("flgH")
	private Integer flgH;
	@JsonProperty("flgW")
	private Integer flgW;
	@JsonProperty("acList")
	private List<AcList> acList = null;
	@JsonProperty("totalAc")
	private Integer totalAc;
	@JsonProperty("lastDv")
	private String lastDv;
	@JsonProperty("shtTrlSec")
	private Integer shtTrlSec;
	@JsonProperty("stm")
	private Integer stm;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("src")
	public Integer getSrc() {
		return src;
	}

	@JsonProperty("src")
	public void setSrc(Integer src) {
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
	public Integer getSrcFeed() {
		return srcFeed;
	}

	@JsonProperty("srcFeed")
	public void setSrcFeed(Integer srcFeed) {
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
	public Integer getFlgH() {
		return flgH;
	}

	@JsonProperty("flgH")
	public void setFlgH(Integer flgH) {
		this.flgH = flgH;
	}

	@JsonProperty("flgW")
	public Integer getFlgW() {
		return flgW;
	}

	@JsonProperty("flgW")
	public void setFlgW(Integer flgW) {
		this.flgW = flgW;
	}

	@JsonProperty("acList")
	public List<AcList> getAcList() {
		return acList;
	}

	@JsonProperty("acList")
	public void setAcList(List<AcList> acList) {
		this.acList = acList;
	}

	@JsonProperty("totalAc")
	public Integer getTotalAc() {
		return totalAc;
	}

	@JsonProperty("totalAc")
	public void setTotalAc(Integer totalAc) {
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
	public Integer getShtTrlSec() {
		return shtTrlSec;
	}

	@JsonProperty("shtTrlSec")
	public void setShtTrlSec(Integer shtTrlSec) {
		this.shtTrlSec = shtTrlSec;
	}

	@JsonProperty("stm")
	public Integer getStm() {
		return stm;
	}

	@JsonProperty("stm")
	public void setStm(Integer stm) {
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
