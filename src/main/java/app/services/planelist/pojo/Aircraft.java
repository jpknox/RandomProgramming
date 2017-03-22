package app.services.planelist.pojo;

/**
 * Created by jpknox on 22/03/17.
 */

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
		"Id",
		"Rcvr",
		"HasSig",
		"Sig",
		"Icao",
		"Bad",
		"Reg",
		"FSeen",
		"TSecs",
		"CMsgs",
		"Alt",
		"GAlt",
		"InHg",
		"AltT",
		"Call",
		"Lat",
		"Long",
		"PosTime",
		"Mlat",
		"Tisb",
		"Spd",
		"Trak",
		"TrkH",
		"Type",
		"Mdl",
		"Man",
		"CNum",
		"From",
		"To",
		"Op",
		"OpIcao",
		"Sqk",
		"Help",
		"Vsi",
		"VsiT",
		"WTC",
		"Species",
		"Engines",
		"EngType",
		"EngMount",
		"Mil",
		"Cou",
		"HasPic",
		"Interested",
		"FlightsCount",
		"Gnd",
		"SpdTyp",
		"CallSus",
		"Trt",
		"Year",
		"TAlt",
		"TTrk",
		"Tag"
})
public class Aircraft {

	@JsonProperty("Id")
	private Long id;
	@JsonProperty("Rcvr")
	private Long rcvr;
	@JsonProperty("HasSig")
	private Boolean hasSig;
	@JsonProperty("Sig")
	private Long sig;
	@JsonProperty("Icao")
	private String icao;
	@JsonProperty("Bad")
	private Boolean bad;
	@JsonProperty("Reg")
	private String reg;
	@JsonProperty("FSeen")
	private String fSeen;
	@JsonProperty("TSecs")
	private Long tSecs;
	@JsonProperty("CMsgs")
	private Long cMsgs;
	@JsonProperty("Alt")
	private Long alt;
	@JsonProperty("GAlt")
	private Long gAlt;
	@JsonProperty("InHg")
	private Double inHg;
	@JsonProperty("AltT")
	private Long altT;
	@JsonProperty("Call")
	private String call;
	@JsonProperty("Lat")
	private Double lat;
	@JsonProperty("Long")
	private Double _long;
	@JsonProperty("PosTime")
	private Long posTime;
	@JsonProperty("Mlat")
	private Boolean mlat;
	@JsonProperty("Tisb")
	private Boolean tisb;
	@JsonProperty("Spd")
	private Double spd;
	@JsonProperty("Trak")
	private Double trak;
	@JsonProperty("TrkH")
	private Boolean trkH;
	@JsonProperty("Type")
	private String type;
	@JsonProperty("Mdl")
	private String mdl;
	@JsonProperty("Man")
	private String man;
	@JsonProperty("CNum")
	private String cNum;
	@JsonProperty("From")
	private String from;
	@JsonProperty("To")
	private String to;
	@JsonProperty("Op")
	private String op;
	@JsonProperty("OpIcao")
	private String opIcao;
	@JsonProperty("Sqk")
	private String sqk;
	@JsonProperty("Help")
	private Boolean help;
	@JsonProperty("Vsi")
	private Long vsi;
	@JsonProperty("VsiT")
	private Long vsiT;
	@JsonProperty("WTC")
	private Long wTC;
	@JsonProperty("Species")
	private Long species;
	@JsonProperty("Engines")
	private String engines;
	@JsonProperty("EngType")
	private Long engType;
	@JsonProperty("EngMount")
	private Long engMount;
	@JsonProperty("Mil")
	private Boolean mil;
	@JsonProperty("Cou")
	private String cou;
	@JsonProperty("HasPic")
	private Boolean hasPic;
	@JsonProperty("Interested")
	private Boolean interested;
	@JsonProperty("FlightsCount")
	private Long flightsCount;
	@JsonProperty("Gnd")
	private Boolean gnd;
	@JsonProperty("SpdTyp")
	private Long spdTyp;
	@JsonProperty("CallSus")
	private Boolean callSus;
	@JsonProperty("Trt")
	private Long trt;
	@JsonProperty("Year")
	private String year;
	@JsonProperty("TAlt")
	private Long tAlt;
	@JsonProperty("TTrk")
	private Double tTrk;
	@JsonProperty("Tag")
	private String tag;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("Id")
	public Long getId() {
		return id;
	}

	@JsonProperty("Id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("Rcvr")
	public Long getRcvr() {
		return rcvr;
	}

	@JsonProperty("Rcvr")
	public void setRcvr(Long rcvr) {
		this.rcvr = rcvr;
	}

	@JsonProperty("HasSig")
	public Boolean getHasSig() {
		return hasSig;
	}

	@JsonProperty("HasSig")
	public void setHasSig(Boolean hasSig) {
		this.hasSig = hasSig;
	}

	@JsonProperty("Sig")
	public Long getSig() {
		return sig;
	}

	@JsonProperty("Sig")
	public void setSig(Long sig) {
		this.sig = sig;
	}

	@JsonProperty("Icao")
	public String getIcao() {
		return icao;
	}

	@JsonProperty("Icao")
	public void setIcao(String icao) {
		this.icao = icao;
	}

	@JsonProperty("Bad")
	public Boolean getBad() {
		return bad;
	}

	@JsonProperty("Bad")
	public void setBad(Boolean bad) {
		this.bad = bad;
	}

	@JsonProperty("Reg")
	public String getReg() {
		return reg;
	}

	@JsonProperty("Reg")
	public void setReg(String reg) {
		this.reg = reg;
	}

	@JsonProperty("FSeen")
	public String getFSeen() {
		return fSeen;
	}

	@JsonProperty("FSeen")
	public void setFSeen(String fSeen) {
		this.fSeen = fSeen;
	}

	@JsonProperty("TSecs")
	public Long getTSecs() {
		return tSecs;
	}

	@JsonProperty("TSecs")
	public void setTSecs(Long tSecs) {
		this.tSecs = tSecs;
	}

	@JsonProperty("CMsgs")
	public Long getCMsgs() {
		return cMsgs;
	}

	@JsonProperty("CMsgs")
	public void setCMsgs(Long cMsgs) {
		this.cMsgs = cMsgs;
	}

	@JsonProperty("Alt")
	public Long getAlt() {
		return alt;
	}

	@JsonProperty("Alt")
	public void setAlt(Long alt) {
		this.alt = alt;
	}

	@JsonProperty("GAlt")
	public Long getGAlt() {
		return gAlt;
	}

	@JsonProperty("GAlt")
	public void setGAlt(Long gAlt) {
		this.gAlt = gAlt;
	}

	@JsonProperty("InHg")
	public Double getInHg() {
		return inHg;
	}

	@JsonProperty("InHg")
	public void setInHg(Double inHg) {
		this.inHg = inHg;
	}

	@JsonProperty("AltT")
	public Long getAltT() {
		return altT;
	}

	@JsonProperty("AltT")
	public void setAltT(Long altT) {
		this.altT = altT;
	}

	@JsonProperty("Call")
	public String getCall() {
		return call;
	}

	@JsonProperty("Call")
	public void setCall(String call) {
		this.call = call;
	}

	@JsonProperty("Lat")
	public Double getLat() {
		return lat;
	}

	@JsonProperty("Lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}

	@JsonProperty("Long")
	public Double getLong() {
		return _long;
	}

	@JsonProperty("Long")
	public void setLong(Double _long) {
		this._long = _long;
	}

	@JsonProperty("PosTime")
	public Long getPosTime() {
		return posTime;
	}

	@JsonProperty("PosTime")
	public void setPosTime(Long posTime) {
		this.posTime = posTime;
	}

	@JsonProperty("Mlat")
	public Boolean getMlat() {
		return mlat;
	}

	@JsonProperty("Mlat")
	public void setMlat(Boolean mlat) {
		this.mlat = mlat;
	}

	@JsonProperty("Tisb")
	public Boolean getTisb() {
		return tisb;
	}

	@JsonProperty("Tisb")
	public void setTisb(Boolean tisb) {
		this.tisb = tisb;
	}

	@JsonProperty("Spd")
	public Double getSpd() {
		return spd;
	}

	@JsonProperty("Spd")
	public void setSpd(Double spd) {
		this.spd = spd;
	}

	@JsonProperty("Trak")
	public Double getTrak() {
		return trak;
	}

	@JsonProperty("Trak")
	public void setTrak(Double trak) {
		this.trak = trak;
	}

	@JsonProperty("TrkH")
	public Boolean getTrkH() {
		return trkH;
	}

	@JsonProperty("TrkH")
	public void setTrkH(Boolean trkH) {
		this.trkH = trkH;
	}

	@JsonProperty("Type")
	public String getType() {
		return type;
	}

	@JsonProperty("Type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("Mdl")
	public String getMdl() {
		return mdl;
	}

	@JsonProperty("Mdl")
	public void setMdl(String mdl) {
		this.mdl = mdl;
	}

	@JsonProperty("Man")
	public String getMan() {
		return man;
	}

	@JsonProperty("Man")
	public void setMan(String man) {
		this.man = man;
	}

	@JsonProperty("CNum")
	public String getCNum() {
		return cNum;
	}

	@JsonProperty("CNum")
	public void setCNum(String cNum) {
		this.cNum = cNum;
	}

	@JsonProperty("From")
	public String getFrom() {
		return from;
	}

	@JsonProperty("From")
	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("To")
	public String getTo() {
		return to;
	}

	@JsonProperty("To")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("Op")
	public String getOp() {
		return op;
	}

	@JsonProperty("Op")
	public void setOp(String op) {
		this.op = op;
	}

	@JsonProperty("OpIcao")
	public String getOpIcao() {
		return opIcao;
	}

	@JsonProperty("OpIcao")
	public void setOpIcao(String opIcao) {
		this.opIcao = opIcao;
	}

	@JsonProperty("Sqk")
	public String getSqk() {
		return sqk;
	}

	@JsonProperty("Sqk")
	public void setSqk(String sqk) {
		this.sqk = sqk;
	}

	@JsonProperty("Help")
	public Boolean getHelp() {
		return help;
	}

	@JsonProperty("Help")
	public void setHelp(Boolean help) {
		this.help = help;
	}

	@JsonProperty("Vsi")
	public Long getVsi() {
		return vsi;
	}

	@JsonProperty("Vsi")
	public void setVsi(Long vsi) {
		this.vsi = vsi;
	}

	@JsonProperty("VsiT")
	public Long getVsiT() {
		return vsiT;
	}

	@JsonProperty("VsiT")
	public void setVsiT(Long vsiT) {
		this.vsiT = vsiT;
	}

	@JsonProperty("WTC")
	public Long getWTC() {
		return wTC;
	}

	@JsonProperty("WTC")
	public void setWTC(Long wTC) {
		this.wTC = wTC;
	}

	@JsonProperty("Species")
	public Long getSpecies() {
		return species;
	}

	@JsonProperty("Species")
	public void setSpecies(Long species) {
		this.species = species;
	}

	@JsonProperty("Engines")
	public String getEngines() {
		return engines;
	}

	@JsonProperty("Engines")
	public void setEngines(String engines) {
		this.engines = engines;
	}

	@JsonProperty("EngType")
	public Long getEngType() {
		return engType;
	}

	@JsonProperty("EngType")
	public void setEngType(Long engType) {
		this.engType = engType;
	}

	@JsonProperty("EngMount")
	public Long getEngMount() {
		return engMount;
	}

	@JsonProperty("EngMount")
	public void setEngMount(Long engMount) {
		this.engMount = engMount;
	}

	@JsonProperty("Mil")
	public Boolean getMil() {
		return mil;
	}

	@JsonProperty("Mil")
	public void setMil(Boolean mil) {
		this.mil = mil;
	}

	@JsonProperty("Cou")
	public String getCou() {
		return cou;
	}

	@JsonProperty("Cou")
	public void setCou(String cou) {
		this.cou = cou;
	}

	@JsonProperty("HasPic")
	public Boolean getHasPic() {
		return hasPic;
	}

	@JsonProperty("HasPic")
	public void setHasPic(Boolean hasPic) {
		this.hasPic = hasPic;
	}

	@JsonProperty("Interested")
	public Boolean getInterested() {
		return interested;
	}

	@JsonProperty("Interested")
	public void setInterested(Boolean interested) {
		this.interested = interested;
	}

	@JsonProperty("FlightsCount")
	public Long getFlightsCount() {
		return flightsCount;
	}

	@JsonProperty("FlightsCount")
	public void setFlightsCount(Long flightsCount) {
		this.flightsCount = flightsCount;
	}

	@JsonProperty("Gnd")
	public Boolean getGnd() {
		return gnd;
	}

	@JsonProperty("Gnd")
	public void setGnd(Boolean gnd) {
		this.gnd = gnd;
	}

	@JsonProperty("SpdTyp")
	public Long getSpdTyp() {
		return spdTyp;
	}

	@JsonProperty("SpdTyp")
	public void setSpdTyp(Long spdTyp) {
		this.spdTyp = spdTyp;
	}

	@JsonProperty("CallSus")
	public Boolean getCallSus() {
		return callSus;
	}

	@JsonProperty("CallSus")
	public void setCallSus(Boolean callSus) {
		this.callSus = callSus;
	}

	@JsonProperty("Trt")
	public Long getTrt() {
		return trt;
	}

	@JsonProperty("Trt")
	public void setTrt(Long trt) {
		this.trt = trt;
	}

	@JsonProperty("Year")
	public String getYear() {
		return year;
	}

	@JsonProperty("Year")
	public void setYear(String year) {
		this.year = year;
	}

	@JsonProperty("TAlt")
	public Long getTAlt() {
		return tAlt;
	}

	@JsonProperty("TAlt")
	public void setTAlt(Long tAlt) {
		this.tAlt = tAlt;
	}

	@JsonProperty("TTrk")
	public Double getTTrk() {
		return tTrk;
	}

	@JsonProperty("TTrk")
	public void setTTrk(Double tTrk) {
		this.tTrk = tTrk;
	}

	@JsonProperty("Tag")
	public String getTag() {
		return tag;
	}

	@JsonProperty("Tag")
	public void setTag(String tag) {
		this.tag = tag;
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

