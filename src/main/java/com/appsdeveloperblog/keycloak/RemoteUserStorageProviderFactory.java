package com.appsdeveloperblog.keycloak;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class RemoteUserStorageProviderFactory implements UserStorageProviderFactory<RemoteUserStorageProvider> {

    private static final String PROVIDER_NAME = "postgres-remote-user-storage-provider-id";

    @Override
    public RemoteUserStorageProvider create(KeycloakSession keycloakSession, ComponentModel componentModel) {
        return RemoteUserStorageProvider.builder()
                                        .keycloakSession(keycloakSession)
                                        .componentModel(componentModel)
                                        .build();
    }

    @Override
    public String getId() {
        return PROVIDER_NAME;
    }
}
