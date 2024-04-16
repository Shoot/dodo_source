package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdd;
import defpackage.ns4;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: fuc  reason: default package */
/* loaded from: classes2.dex */
public abstract class fuc extends msc implements guc {
    public fuc() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static guc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof guc) {
            return (guc) queryLocalInterface;
        }
        return new iuc(iBinder);
    }

    @Override // defpackage.msc
    protected final boolean x(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        huc jucVar;
        huc hucVar;
        huc hucVar2 = null;
        huc hucVar3 = null;
        huc hucVar4 = null;
        huc hucVar5 = null;
        fvc fvcVar = null;
        fvc fvcVar2 = null;
        fvc fvcVar3 = null;
        huc hucVar6 = null;
        huc hucVar7 = null;
        huc hucVar8 = null;
        huc hucVar9 = null;
        huc hucVar10 = null;
        huc hucVar11 = null;
        gvc gvcVar = null;
        huc hucVar12 = null;
        huc hucVar13 = null;
        huc hucVar14 = null;
        huc hucVar15 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                lsc.f(parcel);
                initialize(ns4.a.C(parcel.readStrongBinder()), (zzdd) lsc.a(parcel, zzdd.CREATOR), readLong);
                break;
            case 2:
                boolean h = lsc.h(parcel);
                boolean h2 = lsc.h(parcel);
                long readLong2 = parcel.readLong();
                lsc.f(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) lsc.a(parcel, Bundle.CREATOR), h, h2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) lsc.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    hucVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof huc) {
                        jucVar = (huc) queryLocalInterface;
                    } else {
                        jucVar = new juc(readStrongBinder);
                    }
                    hucVar = jucVar;
                }
                long readLong3 = parcel.readLong();
                lsc.f(parcel);
                logEventAndBundle(readString, readString2, bundle, hucVar, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                ns4 C = ns4.a.C(parcel.readStrongBinder());
                boolean h3 = lsc.h(parcel);
                long readLong4 = parcel.readLong();
                lsc.f(parcel);
                setUserProperty(readString3, readString4, C, h3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean h4 = lsc.h(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof huc) {
                        hucVar2 = (huc) queryLocalInterface2;
                    } else {
                        hucVar2 = new juc(readStrongBinder2);
                    }
                }
                lsc.f(parcel);
                getUserProperties(readString5, readString6, h4, hucVar2);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof huc) {
                        hucVar15 = (huc) queryLocalInterface3;
                    } else {
                        hucVar15 = new juc(readStrongBinder3);
                    }
                }
                lsc.f(parcel);
                getMaxUserProperties(readString7, hucVar15);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                lsc.f(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                lsc.f(parcel);
                setConditionalUserProperty((Bundle) lsc.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                lsc.f(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) lsc.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof huc) {
                        hucVar14 = (huc) queryLocalInterface4;
                    } else {
                        hucVar14 = new juc(readStrongBinder4);
                    }
                }
                lsc.f(parcel);
                getConditionalUserProperties(readString9, readString10, hucVar14);
                break;
            case 11:
                boolean h5 = lsc.h(parcel);
                long readLong7 = parcel.readLong();
                lsc.f(parcel);
                setMeasurementEnabled(h5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                lsc.f(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                lsc.f(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                lsc.f(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                ns4 C2 = ns4.a.C(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                lsc.f(parcel);
                setCurrentScreen(C2, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof huc) {
                        hucVar13 = (huc) queryLocalInterface5;
                    } else {
                        hucVar13 = new juc(readStrongBinder5);
                    }
                }
                lsc.f(parcel);
                getCurrentScreenName(hucVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof huc) {
                        hucVar12 = (huc) queryLocalInterface6;
                    } else {
                        hucVar12 = new juc(readStrongBinder6);
                    }
                }
                lsc.f(parcel);
                getCurrentScreenClass(hucVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof gvc) {
                        gvcVar = (gvc) queryLocalInterface7;
                    } else {
                        gvcVar = new ivc(readStrongBinder7);
                    }
                }
                lsc.f(parcel);
                setInstanceIdProvider(gvcVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof huc) {
                        hucVar11 = (huc) queryLocalInterface8;
                    } else {
                        hucVar11 = new juc(readStrongBinder8);
                    }
                }
                lsc.f(parcel);
                getCachedAppInstanceId(hucVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof huc) {
                        hucVar10 = (huc) queryLocalInterface9;
                    } else {
                        hucVar10 = new juc(readStrongBinder9);
                    }
                }
                lsc.f(parcel);
                getAppInstanceId(hucVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof huc) {
                        hucVar9 = (huc) queryLocalInterface10;
                    } else {
                        hucVar9 = new juc(readStrongBinder10);
                    }
                }
                lsc.f(parcel);
                getGmpAppId(hucVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof huc) {
                        hucVar8 = (huc) queryLocalInterface11;
                    } else {
                        hucVar8 = new juc(readStrongBinder11);
                    }
                }
                lsc.f(parcel);
                generateEventId(hucVar8);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                lsc.f(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                lsc.f(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                ns4 C3 = ns4.a.C(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                lsc.f(parcel);
                onActivityStarted(C3, readLong14);
                break;
            case 26:
                ns4 C4 = ns4.a.C(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                lsc.f(parcel);
                onActivityStopped(C4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                lsc.f(parcel);
                onActivityCreated(ns4.a.C(parcel.readStrongBinder()), (Bundle) lsc.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                ns4 C5 = ns4.a.C(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                lsc.f(parcel);
                onActivityDestroyed(C5, readLong17);
                break;
            case 29:
                ns4 C6 = ns4.a.C(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                lsc.f(parcel);
                onActivityPaused(C6, readLong18);
                break;
            case 30:
                ns4 C7 = ns4.a.C(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                lsc.f(parcel);
                onActivityResumed(C7, readLong19);
                break;
            case 31:
                ns4 C8 = ns4.a.C(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof huc) {
                        hucVar7 = (huc) queryLocalInterface12;
                    } else {
                        hucVar7 = new juc(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                lsc.f(parcel);
                onActivitySaveInstanceState(C8, hucVar7, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) lsc.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof huc) {
                        hucVar6 = (huc) queryLocalInterface13;
                    } else {
                        hucVar6 = new juc(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                lsc.f(parcel);
                performAction(bundle2, hucVar6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                ns4 C9 = ns4.a.C(parcel.readStrongBinder());
                ns4 C10 = ns4.a.C(parcel.readStrongBinder());
                ns4 C11 = ns4.a.C(parcel.readStrongBinder());
                lsc.f(parcel);
                logHealthData(readInt, readString15, C9, C10, C11);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof fvc) {
                        fvcVar3 = (fvc) queryLocalInterface14;
                    } else {
                        fvcVar3 = new hvc(readStrongBinder14);
                    }
                }
                lsc.f(parcel);
                setEventInterceptor(fvcVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof fvc) {
                        fvcVar2 = (fvc) queryLocalInterface15;
                    } else {
                        fvcVar2 = new hvc(readStrongBinder15);
                    }
                }
                lsc.f(parcel);
                registerOnMeasurementEventListener(fvcVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof fvc) {
                        fvcVar = (fvc) queryLocalInterface16;
                    } else {
                        fvcVar = new hvc(readStrongBinder16);
                    }
                }
                lsc.f(parcel);
                unregisterOnMeasurementEventListener(fvcVar);
                break;
            case 37:
                HashMap b = lsc.b(parcel);
                lsc.f(parcel);
                initForTests(b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof huc) {
                        hucVar5 = (huc) queryLocalInterface17;
                    } else {
                        hucVar5 = new juc(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                lsc.f(parcel);
                getTestFlag(hucVar5, readInt2);
                break;
            case 39:
                boolean h6 = lsc.h(parcel);
                lsc.f(parcel);
                setDataCollectionEnabled(h6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof huc) {
                        hucVar4 = (huc) queryLocalInterface18;
                    } else {
                        hucVar4 = new juc(readStrongBinder18);
                    }
                }
                lsc.f(parcel);
                isDataCollectionEnabled(hucVar4);
                break;
            case 41:
            default:
                return false;
            case 42:
                lsc.f(parcel);
                setDefaultEventParameters((Bundle) lsc.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                lsc.f(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                lsc.f(parcel);
                setConsent((Bundle) lsc.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                lsc.f(parcel);
                setConsentThirdParty((Bundle) lsc.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof huc) {
                        hucVar3 = (huc) queryLocalInterface19;
                    } else {
                        hucVar3 = new juc(readStrongBinder19);
                    }
                }
                lsc.f(parcel);
                getSessionId(hucVar3);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
