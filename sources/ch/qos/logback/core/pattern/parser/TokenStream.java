package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.util.IEscapeUtil;
import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import ch.qos.logback.core.pattern.util.RestrictedEscapeUtil;
import ch.qos.logback.core.spi.ScanException;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TokenStream {
    final IEscapeUtil escapeUtil;
    final IEscapeUtil optionEscapeUtil;
    final String pattern;
    final int patternLength;
    int pointer;
    TokenizerState state;

    /* renamed from: ch.qos.logback.core.pattern.parser.TokenStream$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState;

        static {
            int[] iArr = new int[TokenizerState.values().length];
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = iArr;
            try {
                iArr[TokenizerState.LITERAL_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.OPTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.KEYWORD_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[TokenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum TokenizerState {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    TokenStream(String str) {
        this(str, new RegularEscapeUtil());
    }

    private void addValuedToken(int i, StringBuffer stringBuffer, List<Token> list) {
        if (stringBuffer.length() > 0) {
            list.add(new Token(i, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    private void handleFormatModifierState(char c, List<Token> list, StringBuffer stringBuffer) {
        if (c == '(') {
            addValuedToken(CommonCode.BusInterceptor.PRIVACY_CANCEL, stringBuffer, list);
            list.add(Token.BARE_COMPOSITE_KEYWORD_TOKEN);
            this.state = TokenizerState.LITERAL_STATE;
            return;
        }
        if (Character.isJavaIdentifierStart(c)) {
            addValuedToken(CommonCode.BusInterceptor.PRIVACY_CANCEL, stringBuffer, list);
            this.state = TokenizerState.KEYWORD_STATE;
        }
        stringBuffer.append(c);
    }

    private void handleKeywordState(char c, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (Character.isJavaIdentifierPart(c)) {
            stringBuffer.append(c);
            return;
        }
        if (c == '{') {
            addValuedToken(1004, stringBuffer, list);
            tokenizerState = TokenizerState.OPTION_STATE;
        } else {
            if (c == '(') {
                addValuedToken(1005, stringBuffer, list);
            } else if (c == '%') {
                addValuedToken(1004, stringBuffer, list);
                list.add(Token.PERCENT_TOKEN);
                tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
            } else {
                addValuedToken(1004, stringBuffer, list);
                if (c == ')') {
                    tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
                } else if (c == '\\') {
                    int i = this.pointer;
                    if (i < this.patternLength) {
                        String str = this.pattern;
                        this.pointer = i + 1;
                        this.escapeUtil.escape("%()", stringBuffer, str.charAt(i), this.pointer);
                    }
                } else {
                    stringBuffer.append(c);
                }
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleLiteralState(char c, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        if (c != '%') {
            if (c != ')') {
                if (c != '\\') {
                    stringBuffer.append(c);
                    return;
                } else {
                    escape("%()", stringBuffer);
                    return;
                }
            }
            addValuedToken(1000, stringBuffer, list);
            tokenizerState = TokenizerState.RIGHT_PARENTHESIS_STATE;
        } else {
            addValuedToken(1000, stringBuffer, list);
            list.add(Token.PERCENT_TOKEN);
            tokenizerState = TokenizerState.FORMAT_MODIFIER_STATE;
        }
        this.state = tokenizerState;
    }

    private void handleRightParenthesisState(char c, List<Token> list, StringBuffer stringBuffer) {
        TokenizerState tokenizerState;
        list.add(Token.RIGHT_PARENTHESIS_TOKEN);
        if (c != ')') {
            if (c != '\\') {
                if (c != '{') {
                    stringBuffer.append(c);
                } else {
                    tokenizerState = TokenizerState.OPTION_STATE;
                    this.state = tokenizerState;
                }
            } else {
                escape("%{}", stringBuffer);
            }
            tokenizerState = TokenizerState.LITERAL_STATE;
            this.state = tokenizerState;
        }
    }

    private void processOption(char c, List<Token> list, StringBuffer stringBuffer) throws ScanException {
        new OptionTokenizer(this).tokenize(c, list);
    }

    void escape(String str, StringBuffer stringBuffer) {
        int i = this.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i + 1;
            this.escapeUtil.escape(str, stringBuffer, str2.charAt(i), this.pointer);
        }
    }

    void optionEscape(String str, StringBuffer stringBuffer) {
        int i = this.pointer;
        if (i < this.patternLength) {
            String str2 = this.pattern;
            this.pointer = i + 1;
            this.optionEscapeUtil.escape(str, stringBuffer, str2.charAt(i), this.pointer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Token> tokenize() throws ScanException {
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i = this.pointer;
            if (i >= this.patternLength) {
                break;
            }
            char charAt = this.pattern.charAt(i);
            this.pointer++;
            int i2 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                handleRightParenthesisState(charAt, arrayList, stringBuffer);
                            }
                        } else {
                            handleKeywordState(charAt, arrayList, stringBuffer);
                        }
                    } else {
                        processOption(charAt, arrayList, stringBuffer);
                    }
                } else {
                    handleFormatModifierState(charAt, arrayList, stringBuffer);
                }
            } else {
                handleLiteralState(charAt, arrayList, stringBuffer);
            }
        }
        int i3 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[this.state.ordinal()];
        if (i3 != 1) {
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        arrayList.add(Token.RIGHT_PARENTHESIS_TOKEN);
                    }
                } else {
                    arrayList.add(new Token(1004, stringBuffer.toString()));
                }
            } else {
                throw new ScanException("Unexpected end of pattern string");
            }
        } else {
            addValuedToken(1000, stringBuffer, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TokenStream(String str, IEscapeUtil iEscapeUtil) {
        this.optionEscapeUtil = new RestrictedEscapeUtil();
        this.state = TokenizerState.LITERAL_STATE;
        this.pointer = 0;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.pattern = str;
        this.patternLength = str.length();
        this.escapeUtil = iEscapeUtil;
    }
}
