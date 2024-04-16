package ch.qos.logback.classic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
/* loaded from: classes.dex */
public class ContextInitializer {
    public static final String AUTOCONFIG_FILE = "assets/logback.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    final ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
    final LoggerContext loggerContext;

    public ContextInitializer(LoggerContext loggerContext) {
        this.loggerContext = loggerContext;
    }

    private URL findConfigFileFromSystemProperties(boolean z) {
        String str;
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        String str2 = null;
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z) {
                            statusOnResourceSearch(systemProperty, this.classLoader, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z) {
                        ClassLoader classLoader = this.classLoader;
                        if (url != null) {
                            str2 = url.toString();
                        }
                        statusOnResourceSearch(systemProperty, classLoader, str2);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.classLoader);
                    if (resource != null) {
                        if (z) {
                            statusOnResourceSearch(systemProperty, this.classLoader, resource.toString());
                        }
                        return resource;
                    } else if (z) {
                        ClassLoader classLoader2 = this.classLoader;
                        if (resource != null) {
                            str = resource.toString();
                        } else {
                            str = null;
                        }
                        statusOnResourceSearch(systemProperty, classLoader2, str);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (z) {
                statusOnResourceSearch(systemProperty, this.classLoader, null);
            }
            throw th;
        }
    }

    private URL findConfigFileURLFromAssets(boolean z) {
        return getResource(AUTOCONFIG_FILE, this.classLoader, z);
    }

    private URL getResource(String str, ClassLoader classLoader, boolean z) {
        String str2;
        URL resource = classLoader.getResource(str);
        if (z) {
            if (resource != null) {
                str2 = str;
            } else {
                str2 = null;
            }
            statusOnResourceSearch(str, classLoader, str2);
        }
        return resource;
    }

    private void statusOnResourceSearch(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.loggerContext.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus("Could NOT find resource [" + str + "]", this.loggerContext));
            return;
        }
        statusManager.add(new InfoStatus("Found resource [" + str + "] at [" + str2 + "]", this.loggerContext));
    }

    public void autoConfig() throws JoranException {
        StatusListenerConfigHelper.installIfAsked(this.loggerContext);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.loggerContext);
        URL findConfigFileFromSystemProperties = findConfigFileFromSystemProperties(true);
        if (findConfigFileFromSystemProperties != null) {
            joranConfigurator.doConfigure(findConfigFileFromSystemProperties);
            return;
        }
        URL findConfigFileURLFromAssets = findConfigFileURLFromAssets(true);
        if (findConfigFileURLFromAssets != null) {
            joranConfigurator.doConfigure(findConfigFileURLFromAssets);
        }
    }
}
