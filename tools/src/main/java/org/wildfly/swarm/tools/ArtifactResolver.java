/**
 * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wildfly.swarm.tools;

import java.util.Set;

/**
 * @author Heiko Braun
 * @since 24/10/2016
 */
public interface ArtifactResolver {

    ArtifactSpec resolveArtifact(ArtifactSpec spec) throws Exception;

    Set<ArtifactSpec> resolveAllArtifactsTransitively(Set<ArtifactSpec> specs, boolean excludes) throws Exception;

    Set<ArtifactSpec> resolveAllArtifactsNonTransitively(Set<ArtifactSpec> specs) throws Exception;
}
