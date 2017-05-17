package io.oasp.application.mtsj.reservationmanagement.common.api;

import java.sql.Timestamp;

import io.oasp.application.mtsj.general.common.api.ApplicationEntity;

public interface InvitationGuest extends ApplicationEntity {

  public Long getReservationId();

  public void setReservationId(Long reservationId);

  public String getGuestToken();

  public void setGuestToken(String guestToken);

  public String getEmail();

  public void setEmail(String email);

  public boolean isAccepted();

  public void setAccepted(boolean accepted);

  public Timestamp getModificationDate();

  public void setModificationDate(Timestamp modificationDate);

}
