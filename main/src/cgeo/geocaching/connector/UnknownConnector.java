package cgeo.geocaching.connector;

import cgeo.geocaching.Geocache;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jdt.annotation.NonNull;

class UnknownConnector extends AbstractConnector {

    @Override
    public String getName() {
        return "Unknown caches";
    }

    @Override
    @NonNull
    public String getCacheUrl(@NonNull final Geocache cache) {
        throw new IllegalAccessError("getCacheUrl cannot be called on unknown caches");
    }

    @Override
    public String getHost() {
        return null; // we have no host for these caches
    }

    @Override
    public boolean isOwner(final Geocache cache) {
        return false;
    }

    @Override
    public boolean canHandle(final @NonNull String geocode) {
        return StringUtils.isNotBlank(geocode);
    }

    @Override
    protected String getCacheUrlPrefix() {
        return null;
    }

}
