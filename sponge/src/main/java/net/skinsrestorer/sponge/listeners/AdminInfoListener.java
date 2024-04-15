/*
 * SkinsRestorer
 * Copyright (C) 2024  SkinsRestorer Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.skinsrestorer.sponge.listeners;

import lombok.RequiredArgsConstructor;
import net.skinsrestorer.shared.listeners.AdminInfoListenerAdapter;
import net.skinsrestorer.shared.listeners.event.SRServerConnectedEvent;
import net.skinsrestorer.sponge.wrapper.WrapperSponge;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.api.event.EventListener;
import org.spongepowered.api.event.network.ServerSideConnectionEvent;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor_ = @Inject)
public class AdminInfoListener implements EventListener<ServerSideConnectionEvent.Join> {
    private final WrapperSponge wrapper;
    private final AdminInfoListenerAdapter adapter;

    @Override
    public void handle(@NotNull ServerSideConnectionEvent.Join event) {
        adapter.handleConnect(wrap(event));
    }

    private SRServerConnectedEvent wrap(ServerSideConnectionEvent.Join event) {
        return () -> wrapper.player(event.player());
    }
}
