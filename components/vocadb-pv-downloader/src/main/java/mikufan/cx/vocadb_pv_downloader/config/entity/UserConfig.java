package mikufan.cx.vocadb_pv_downloader.config.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import mikufan.cx.project_vd_common_util.pv_service.SupportedPvServices;
import org.eclipse.collections.api.list.ImmutableList;

import java.nio.file.Path;

/**
 * @author CX无敌
 */
public class UserConfig {

  /**
   * optional, user's own preference of choosing the best available service that
   * has the pv available for downloading. if non, we use {@link SupportedPvServices#getSupportedPvServices()}
   * as the default preference
   */
  @JsonProperty
  private ImmutableList<String> pvPreference;

  /**
   * optional, user defined youtube-dl file
   * if non, use our own youtube-dl
   */
  @JsonProperty
  private Path youtubeDlFile;

  /**
   * optional, user defined ffmpeg file that is used for youtube-dl.
   * if non, using Jave2's embedded ffmpeg
   */
  @JsonProperty
  private Path ffmpegFile;

}