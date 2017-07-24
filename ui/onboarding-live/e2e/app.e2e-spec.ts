import { OnboardingLivePage } from './app.po';

describe('onboarding-live App', () => {
  let page: OnboardingLivePage;

  beforeEach(() => {
    page = new OnboardingLivePage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
