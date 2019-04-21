package org.develnext.jphp.zend.ext.standard.date;

import java.time.ZoneId;
import java.util.Collections;
import java.util.Map;

import php.runtime.common.collections.map.CaseInsensitiveMap;

public class ZoneIdFactory {
    private static final Map<String, String> aliases;

    static {
        Map<String, String> m = new CaseInsensitiveMap<>(185);
        m.put("CET", "UTC+01:00");
        m.put("CEST", "UTC+02:00");
        m.put("ACDT", "UTC+10:30");
        m.put("ACST", "UTC+09:30");
        m.put("ACT", "UTC−05:00");
        m.put("ADT", "UTC−05:00");
        m.put("ACWST", "UTC+08:45");
        m.put("AEDT", "UTC+11:00");
        m.put("AEST", "UTC+10:00");
        m.put("AFT", "UTC+04:30");
        m.put("AKDT", "UTC−08:00");
        m.put("AKST", "UTC−09:00");
        m.put("ALMT", "UTC+06:00");
        m.put("AMST", "UTC−03:00");
        m.put("AMT", "UTC+04:00");
        m.put("ANAT", "UTC+12:00");
        m.put("AQTT", "UTC+05:00");
        m.put("ART", "UTC−03:00");
        m.put("AST", "UTC−04:00");
        m.put("AWST", "UTC+08:00");
        m.put("AZOST", "UTC");
        m.put("AZOT", "UTC−01:00");
        m.put("AZT", "UTC+04:00");
        m.put("BDT", "UTC+08:00");
        m.put("BIOT", "UTC+06:00");
        m.put("BIT", "UTC−12:00");
        m.put("BOT", "UTC−04:00");
        m.put("BRST", "UTC−02:00");
        m.put("BRT", "UTC−03:00");
        m.put("BST", "UTC+01:00");
        m.put("BTT", "UTC+06:00");
        m.put("CAT", "UTC+02:00");
        m.put("CCT", "UTC+06:30");
        m.put("CDT", "UTC−05:00");
        m.put("CHADT", "UTC+13:45");
        m.put("CHAST", "UTC+12:45");
        m.put("CHOT", "UTC+08:00");
        m.put("CHOST", "UTC+09:00");
        m.put("CHST", "UTC+10:00");
        m.put("CHUT", "UTC+10:00");
        m.put("CIST", "UTC−08:00");
        m.put("CIT", "UTC+08:00");
        m.put("CKT", "UTC−10:00");
        m.put("CLST", "UTC−03:00");
        m.put("CLT", "UTC−04:00");
        m.put("COST", "UTC−04:00");
        m.put("COT", "UTC−05:00");
        m.put("CST", "UTC−06:00");
        m.put("CT", "UTC+08:00");
        m.put("CVT", "UTC−01:00");
        m.put("CWST", "UTC+08:45");
        m.put("CXT", "UTC+07:00");
        m.put("DAVT", "UTC+07:00");
        m.put("DDUT", "UTC+10:00");
        m.put("DFT", "UTC+01:00");
        m.put("EASST", "UTC−05:00");
        m.put("EAST", "UTC−06:00");
        m.put("EAT", "UTC+03:00");
        m.put("ECT", "UTC−05:00");
        m.put("EDT", "UTC−04:00");
        m.put("EEST", "UTC+03:00");
        m.put("EET", "UTC+02:00");
        m.put("EGST", "UTC");
        m.put("EGT", "UTC−01:00");
        m.put("EIT", "UTC+09:00");
        m.put("EST", "UTC−05:00");
        m.put("FET", "UTC+03:00");
        m.put("FJT", "UTC+12:00");
        m.put("FKST", "UTC−03:00");
        m.put("FKT", "UTC−04:00");
        m.put("FNT", "UTC−02:00");
        m.put("GALT", "UTC−06:00");
        m.put("GAMT", "UTC−09:00");
        m.put("GET", "UTC+04:00");
        m.put("GFT", "UTC−03:00");
        m.put("GILT", "UTC+12:00");
        m.put("GIT", "UTC−09:00");
        m.put("GST", "UTC+04:00");
        m.put("GYT", "UTC−04:00");
        m.put("HDT", "UTC−09:00");
        m.put("HAEC", "UTC+02:00");
        m.put("HST", "UTC−10:00");
        m.put("HKT", "UTC+08:00");
        m.put("HMT", "UTC+05:00");
        m.put("HOVST", "UTC+08:00");
        m.put("HOVT", "UTC+07:00");
        m.put("ICT", "UTC+07:00");
        m.put("IDLW", "UTC−12:00");
        m.put("IDT", "UTC+03:00");
        m.put("IOT", "UTC+03:00");
        m.put("IRDT", "UTC+04:30");
        m.put("IRKT", "UTC+08:00");
        m.put("IRST", "UTC+03:30");
        m.put("IST", "UTC+05:30");
        m.put("JST", "UTC+09:00");
        m.put("KALT", "UTC+02:00");
        m.put("KGT", "UTC+06:00");
        m.put("KOST", "UTC+11:00");
        m.put("KRAT", "UTC+07:00");
        m.put("KST", "UTC+09:00");
        m.put("LHST", "UTC+10:30");
        m.put("LINT", "UTC+14:00");
        m.put("MAGT", "UTC+12:00");
        m.put("MART", "UTC−09:30");
        m.put("MAWT", "UTC+05:00");
        m.put("MDT", "UTC−06:00");
        m.put("MET", "UTC+01:00");
        m.put("MEST", "UTC+02:00");
        m.put("MHT", "UTC+12:00");
        m.put("MIST", "UTC+11:00");
        m.put("MIT", "UTC−09:30");
        m.put("MMT", "UTC+06:30");
        m.put("MSK", "UTC+03:00");
        m.put("MST", "UTC−07:00");
        m.put("MUT", "UTC+04:00");
        m.put("MVT", "UTC+05:00");
        m.put("MYT", "UTC+08:00");
        m.put("NCT", "UTC+11:00");
        m.put("NDT", "UTC−02:30");
        m.put("NFT", "UTC+11:00");
        m.put("NOVT", "UTC+07:00");
        m.put("NPT", "UTC+05:45");
        m.put("NST", "UTC−03:30");
        m.put("NT", "UTC−03:30");
        m.put("NUT", "UTC−11:00");
        m.put("NZDT", "UTC+13:00");
        m.put("NZST", "UTC+12:00");
        m.put("OMST", "UTC+06:00");
        m.put("ORAT", "UTC+05:00");
        m.put("PDT", "UTC-07:00");
        m.put("PET", "UTC−05:00");
        m.put("PETT", "UTC+12:00");
        m.put("PGT", "UTC+10:00");
        m.put("PHOT", "UTC+13:00");
        m.put("PHT", "UTC+08:00");
        m.put("PKT", "UTC+05:00");
        m.put("PMDT", "UTC−02:00");
        m.put("PMST", "UTC−03:00");
        m.put("PONT", "UTC+11:00");
        m.put("PST", "UTC−08:00");
        m.put("PYST", "UTC−03:00");
        m.put("PYT", "UTC−04:00");
        m.put("RET", "UTC+04:00");
        m.put("ROTT", "UTC−03:00");
        m.put("SAKT", "UTC+11:00");
        m.put("SAMT", "UTC+04:00");
        m.put("SAST", "UTC+02:00");
        m.put("SBT", "UTC+11:00");
        m.put("SCT", "UTC+04:00");
        m.put("SDT", "UTC−10:00");
        m.put("SGT", "UTC+08:00");
        m.put("SLST", "UTC+05:30");
        m.put("SRET", "UTC+11:00");
        m.put("SRT", "UTC−03:00");
        m.put("SST", "UTC−11:00");
        m.put("SYOT", "UTC+03:00");
        m.put("TAHT", "UTC−10:00");
        m.put("THA", "UTC+07:00");
        m.put("TFT", "UTC+05:00");
        m.put("TJT", "UTC+05:00");
        m.put("TKT", "UTC+13:00");
        m.put("TLT", "UTC+09:00");
        m.put("TMT", "UTC+05:00");
        m.put("TRT", "UTC+03:00");
        m.put("TOT", "UTC+13:00");
        m.put("TVT", "UTC+12:00");
        m.put("ULAST", "UTC+09:00");
        m.put("ULAT", "UTC+08:00");
        m.put("UYST", "UTC−02:00");
        m.put("UYT", "UTC−03:00");
        m.put("UZT", "UTC+05:00");
        m.put("VET", "UTC−04:00");
        m.put("VLAT", "UTC+10:00");
        m.put("VOLT", "UTC+04:00");
        m.put("VOST", "UTC+06:00");
        m.put("VUT", "UTC+11:00");
        m.put("WAKT", "UTC+12:00");
        m.put("WAST", "UTC+02:00");
        m.put("WAT", "UTC+01:00");
        m.put("WEST", "UTC+01:00");
        m.put("WET", "UTC");
        m.put("WIT", "UTC+07:00");
        m.put("WST", "UTC+08:00");
        m.put("YAKT", "UTC+09:00");
        m.put("YEKT", "UTC+05:00");


        aliases = Collections.unmodifiableMap(m);
    }

    static Map<String, String> getAliases() {
        return aliases;
    }

    public static ZoneId of(String id) {
        return ZoneId.of(id, aliases);
    }
}
