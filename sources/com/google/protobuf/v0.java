package com.google.protobuf;

import com.google.protobuf.d0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reader.java */
/* loaded from: classes.dex */
public interface v0 {
    int A() throws IOException;

    void B(List<String> list) throws IOException;

    void C(List<Float> list) throws IOException;

    boolean D() throws IOException;

    int E() throws IOException;

    void F(List<f> list) throws IOException;

    void G(List<Double> list) throws IOException;

    long H() throws IOException;

    String I() throws IOException;

    @Deprecated
    <T> void J(List<T> list, w0<T> w0Var, m mVar) throws IOException;

    <T> void K(List<T> list, w0<T> w0Var, m mVar) throws IOException;

    @Deprecated
    <T> T L(Class<T> cls, m mVar) throws IOException;

    <K, V> void M(Map<K, V> map, d0.a<K, V> aVar, m mVar) throws IOException;

    <T> T N(Class<T> cls, m mVar) throws IOException;

    <T> void O(T t, w0<T> w0Var, m mVar) throws IOException;

    <T> void P(T t, w0<T> w0Var, m mVar) throws IOException;

    int a();

    long b() throws IOException;

    void c(List<Integer> list) throws IOException;

    void d(List<Long> list) throws IOException;

    boolean e() throws IOException;

    long f() throws IOException;

    void g(List<Long> list) throws IOException;

    int h() throws IOException;

    void i(List<Long> list) throws IOException;

    void j(List<Integer> list) throws IOException;

    int k() throws IOException;

    int l() throws IOException;

    void m(List<Boolean> list) throws IOException;

    void n(List<String> list) throws IOException;

    f o() throws IOException;

    int p() throws IOException;

    void q(List<Long> list) throws IOException;

    void r(List<Integer> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    long s() throws IOException;

    void t(List<Integer> list) throws IOException;

    int u() throws IOException;

    void v(List<Long> list) throws IOException;

    void w(List<Integer> list) throws IOException;

    void x(List<Integer> list) throws IOException;

    long y() throws IOException;

    String z() throws IOException;
}
