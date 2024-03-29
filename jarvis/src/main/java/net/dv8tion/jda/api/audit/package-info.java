/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Implementation for {@link net.dv8tion.jda.api.audit.AuditLogEntry AuditLogEntry}
 * and all utilities needed for its structure.
 * To retrieve entries use the {@link net.dv8tion.jda.api.requests.restaction.pagination.AuditLogPaginationAction AuditLogPaginationAction}
 * which can be retrieved from any {@link net.dv8tion.jda.api.entities.Guild Guild} instance
 * through {@link net.dv8tion.jda.api.entities.Guild#retrieveAuditLogs() Guild.retrieveAuditLogs()}.
 *
 * <p>Each Entry contains a set of {@link net.dv8tion.jda.api.audit.AuditLogChange AuditLogChanges}.
 * <br>To identify what kind of entry is represented use {@link net.dv8tion.jda.api.audit.ActionType ActionType}!
 *
 * @since  3.1.1
 */
package net.dv8tion.jda.api.audit;
