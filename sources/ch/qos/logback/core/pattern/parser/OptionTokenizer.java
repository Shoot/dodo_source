package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.parser.TokenStream;
import ch.qos.logback.core.pattern.util.AsIsEscapeUtil;
import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class OptionTokenizer {
    private static final int EXPECTING_STATE = 0;
    private static final int QUOTED_COLLECTING_STATE = 2;
    private static final int RAW_COLLECTING_STATE = 1;
    final IEscapeUtil escapeUtil;
    final String pattern;
    final int patternLength;
    char quoteChar;
    int state;
    final TokenStream tokenStream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OptionTokenizer(TokenStream tokenStream) {
        this(tokenStream, new AsIsEscapeUtil());
    }

    void emitOptionToken(List<Token> list, List<String> list2) {
        list.add(new Token(1006, list2));
        this.tokenStream.state = TokenStream.TokenizerState.LITERAL_STATE;
    }

    void escape(String str, StringBuffer stringBuffer) {
        TokenStream tokenStream = this.tokenStream;
        int i = tokenStream.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            tokenStream.pointer = i + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i), this.tokenStream.pointer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void tokenize(char c, List<Token> list) throws ScanException {
        String trim;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (this.tokenStream.pointer < this.patternLength) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        char c2 = this.quoteChar;
                        if (c == c2) {
                            trim = stringBuffer.toString();
                            arrayList.add(trim);
                            stringBuffer.setLength(0);
                            this.state = 0;
                        } else {
                            if (c == '\\') {
                                escape(String.valueOf(c2), stringBuffer);
                            }
                            stringBuffer.append(c);
                        }
                    }
                } else if (c != ',') {
                    if (c == '}') {
                        arrayList.add(stringBuffer.toString().trim());
                        emitOptionToken(list, arrayList);
                        return;
                    }
                    stringBuffer.append(c);
                } else {
                    trim = stringBuffer.toString().trim();
                    arrayList.add(trim);
                    stringBuffer.setLength(0);
                    this.state = 0;
                }
            } else if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                if (c != '\"' && c != '\'') {
                    if (c == ',') {
                        continue;
                    } else if (c != '}') {
                        stringBuffer.append(c);
                        this.state = 1;
                    } else {
                        emitOptionToken(list, arrayList);
                        return;
                    }
                } else {
                    this.state = 2;
                    this.quoteChar = c;
                }
            }
            c = this.pattern.charAt(this.tokenStream.pointer);
            this.tokenStream.pointer++;
        }
        if (c == '}') {
            int i2 = this.state;
            if (i2 != 0) {
                if (i2 == 1) {
                    arrayList.add(stringBuffer.toString().trim());
                } else {
                    throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
                }
            }
            emitOptionToken(list, arrayList);
            return;
        }
        throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
    }

    OptionTokenizer(TokenStream tokenStream, IEscapeUtil iEscapeUtil) {
        this.state = 0;
        this.tokenStream = tokenStream;
        this.pattern = tokenStream.pattern;
        this.patternLength = tokenStream.patternLength;
        this.escapeUtil = iEscapeUtil;
    }
}
