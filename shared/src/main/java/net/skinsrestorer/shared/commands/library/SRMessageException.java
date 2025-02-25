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
package net.skinsrestorer.shared.commands.library;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.skinsrestorer.shared.subjects.messages.ComponentString;
import net.skinsrestorer.shared.subjects.messages.SkinsRestorerLocale;

import java.util.function.Function;

@Getter
@RequiredArgsConstructor
public class SRMessageException extends IllegalArgumentException {
    private final Function<SkinsRestorerLocale, ComponentString> messageSupplier;
}
