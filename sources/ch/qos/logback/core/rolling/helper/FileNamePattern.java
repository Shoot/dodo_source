package ch.qos.logback.core.rolling.helper;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.LiteralConverter;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.pattern.util.AlmostAsIsEscapeUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.ScanException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class FileNamePattern extends ContextAwareBase {
    static final Map<String, String> CONVERTER_MAP;
    Converter<Object> headTokenConverter;
    String pattern;

    static {
        HashMap hashMap = new HashMap();
        CONVERTER_MAP = hashMap;
        hashMap.put("i", IntegerTokenConverter.class.getName());
        hashMap.put(DateTokenConverter.CONVERTER_KEY, DateTokenConverter.class.getName());
    }

    public FileNamePattern(String str, Context context) {
        setPattern(FileFilterUtil.slashify(str));
        setContext(context);
        parse();
        ConverterUtil.startConverters(this.headTokenConverter);
    }

    public String convert(Object obj) {
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            sb.append(converter.convert(obj));
        }
        return sb.toString();
    }

    public String convertInt(int i) {
        return convert(Integer.valueOf(i));
    }

    public String convertMultipleArguments(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            if (converter instanceof MonoTypedConverter) {
                MonoTypedConverter monoTypedConverter = (MonoTypedConverter) converter;
                for (Object obj : objArr) {
                    if (monoTypedConverter.isApplicable(obj)) {
                        sb.append(converter.convert(obj));
                    }
                }
            } else {
                sb.append(converter.convert(objArr));
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.pattern;
        String str2 = ((FileNamePattern) obj).pattern;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    String escapeRightParantesis(String str) {
        return this.pattern.replace(")", "\\)");
    }

    public IntegerTokenConverter getIntegerTokenConverter() {
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            if (converter instanceof IntegerTokenConverter) {
                return (IntegerTokenConverter) converter;
            }
        }
        return null;
    }

    public String getPattern() {
        return this.pattern;
    }

    public DateTokenConverter<Object> getPrimaryDateTokenConverter() {
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            if (converter instanceof DateTokenConverter) {
                DateTokenConverter<Object> dateTokenConverter = (DateTokenConverter) converter;
                if (dateTokenConverter.isPrimary()) {
                    return dateTokenConverter;
                }
            }
        }
        return null;
    }

    public boolean hasIntegerTokenCOnverter() {
        if (getIntegerTokenConverter() != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.pattern;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    void parse() {
        try {
            Parser parser = new Parser(escapeRightParantesis(this.pattern), new AlmostAsIsEscapeUtil());
            parser.setContext(this.context);
            this.headTokenConverter = parser.compile(parser.parse(), CONVERTER_MAP);
        } catch (ScanException e) {
            addError("Failed to parse pattern \"" + this.pattern + "\".", e);
        }
    }

    public void setPattern(String str) {
        if (str != null) {
            this.pattern = str.trim().replace("//", "/");
        }
    }

    public String toRegex() {
        return toRegex(false, false);
    }

    public String toRegexForFixedDate(Date date) {
        String regex;
        String convert;
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            if (converter instanceof LiteralConverter) {
                convert = converter.convert(null);
            } else {
                if (converter instanceof IntegerTokenConverter) {
                    regex = "(\\d+)";
                } else if (converter instanceof DateTokenConverter) {
                    DateTokenConverter dateTokenConverter = (DateTokenConverter) converter;
                    if (dateTokenConverter.isPrimary()) {
                        convert = converter.convert(date);
                    } else {
                        regex = dateTokenConverter.toRegex();
                    }
                }
                convert = FileFinder.regexEscapePath(regex);
            }
            sb.append(convert);
        }
        return sb.toString();
    }

    public String toString() {
        return this.pattern;
    }

    public String toRegex(boolean z, boolean z2) {
        String regex;
        String regexEscapePath;
        StringBuilder sb = new StringBuilder();
        for (Converter<Object> converter = this.headTokenConverter; converter != null; converter = converter.getNext()) {
            if (converter instanceof LiteralConverter) {
                regexEscapePath = converter.convert(null);
            } else {
                if (converter instanceof IntegerTokenConverter) {
                    regex = z2 ? "(\\d+)" : "\\d+";
                } else if (converter instanceof DateTokenConverter) {
                    DateTokenConverter dateTokenConverter = (DateTokenConverter) converter;
                    regex = (z && dateTokenConverter.isPrimary()) ? "(" + dateTokenConverter.toRegex() + ")" : dateTokenConverter.toRegex();
                }
                regexEscapePath = FileFinder.regexEscapePath(regex);
            }
            sb.append(regexEscapePath);
        }
        return sb.toString();
    }
}
